package fp

import org.specs2.ScalaCheck
import org.specs2.scalaz.Spec
import scalaz.syntax.equal._

class Chapter4Spec extends Spec with ScalaCheck {


  "Chapter4" should {
    import Chapter4Option._
    "teach us about options and failure" in prop{ (xs: List[Option[Int]]) =>
      Chapter4Option.sequence(xs) ===
    }


  }

}
