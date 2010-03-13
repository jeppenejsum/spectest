package demo.test

import org.specs.Specification
import org.specs.runner._
import org.specs.matcher._

class SimpleUnitTest extends JUnit4(SimpleSpec) 

object SimpleSpec extends Specification  {
   "This test" should {
	   "be run" in {1 must_== 1}
   }
}
