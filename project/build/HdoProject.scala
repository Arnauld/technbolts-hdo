import sbt._

class MailProject(info: ProjectInfo) extends DefaultProject(info) {

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * antlr
   * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  import org.antlr.{Tool=>AntlrTool}

  lazy val antlrGen = task {
      val antlr = new AntlrTool(Array("-o", "src/main/generated-java/org/technbolts/hdo/path/", "src/main/antlr3/Path.g"))
      antlr.process
      None
    } describedAs "Generate Antlr files."
  
  override def compileAction = super.compileAction dependsOn(antlrGen)

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * add generated-java source folder
   * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  def mainGeneratedJavaSourcePath = mainSourcePath / "generated-java"
  override def mainSourceRoots = (mainGeneratedJavaSourcePath##) +++ (mainJavaSourcePath##) +++ (mainScalaSourcePath##)

  /* ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
   * dependencies
   * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ */
  object Version {
    val log4j = "1.2.15"
    val slf4j = "1.6.1"
    val scala = "2.8.0"
    //
    val commonsIO = "1.4"
    val spring = "3.0.4.RELEASE"
    //
    val junit = "4.8.1"
    val scala_specs = "1.6.5"
    val mockito = "1.8.5"
  }

  val jbossRepository = "repository.jboss.org" at "http://repository.jboss.org/nexus/content/groups/public/"

  // Use ivy directly to use exclude behavior
  override def ivyXML =
    <dependencies>
      <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
      <!-- Commons: Http, IO, ...       -->
      <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
        <dependency org="commons-io" name="commons-io" rev={Version.commonsIO}/>
      <dependency org="org.antlr" name="antlr" rev="3.2"/>

      <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
      <!--     Spring       -->
      <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
        <dependency org="org.springframework" name="spring-core" rev={Version.spring}/>
        <dependency org="org.springframework" name="spring-context-support" rev={Version.spring} conf="test->default"/>

      <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
      <!-- Test -->
      <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
        <dependency org="junit" name="junit" rev={Version.junit} conf="test->default"/>
        <dependency org="org.scala-tools.testing" name={"specs_" + Version.scala} rev={Version.scala_specs} conf="test->default"/>
        <dependency org="org.mockito" name="mockito-all" rev={Version.mockito}/>

      <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
      <!-- logs -->
      <!-- ~~~~~~~~~~~~~~~~~~~~~~~~~~~~ -->
        <dependency org="org.slf4j" name="slf4j-api" rev={Version.slf4j}/>
        <dependency org="org.slf4j" name="slf4j-log4j12" rev={Version.slf4j}/>
      <dependency org="log4j" name="log4j" rev={Version.log4j}>
          <exclude name="mail"/>
          <exclude name="jms"/>
          <exclude name="jmxtools"/>
          <exclude name="jmxri"/>
      </dependency>
    </dependencies>
}
