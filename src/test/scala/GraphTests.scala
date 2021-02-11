import GraphDb.getSession
import org.neo4j.driver.Session
import org.scalatest.BeforeAndAfterAll
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers


class GraphTests extends AnyFlatSpec with BeforeAndAfterAll with Matchers {


  val session: Session = getSession()


  override def beforeAll(): Unit = {
    val insertData = "CREATE (u: User {id: 1, firstname: 'Ernst', lastname: 'Young'})"
    session.run(insertData)
  }


  it must "return the correct firstname" in {
    val firstname = session.run("MATCH (u: User {id: 1}) RETURN u")
                           .single()
                           .get("firstname")
                           .asString()
    assert(firstname == "Ernst")
  }

  
  override def afterAll(): Unit = {
    session.run("MATCH (n) DETACH DELETE n")
    session.close()
  }



}
