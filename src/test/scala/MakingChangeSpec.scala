import org.scalatest.funsuite.AnyFunSuite

class MakingChangeSpec extends AnyFunSuite {
  import MakingChange.makingChange

  test("For amount 0 result should be 0 coins") {
    assert(makingChange(0) == 0)
  }

  test("For amount 12 result should be 3 coins") {
    assert(makingChange(12) == 3)
  }

  test("For amount 468 result should be 11 coins") {
    assert(makingChange(468) == 11)
  }
  test("For amount 123456 result should be 254 coins") {
    assert(makingChange(123456) == 254)
  }
}
//comment
