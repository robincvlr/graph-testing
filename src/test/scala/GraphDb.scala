import org.neo4j.driver.{Config, GraphDatabase, Session}
import org.neo4j.harness.junit.rule.Neo4jRule

object GraphDb {

  /**
   * Create and return new session
   * @return Session
   */
  def getSession(): Session =
    GraphDatabase.driver(
      new Neo4jRule().boltURI(),
      Config.defaultConfig()
    ).session()

}
