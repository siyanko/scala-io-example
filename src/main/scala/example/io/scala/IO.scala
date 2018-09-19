package example.io.scala

final case class IO[A](runUnsafe: Function[Unit, A]) {

  def map[B](f: A => B): IO[B] = ???

  def flatMap[B](f: A => IO[B]): IO[B] = ???

}

object IO {
  def apply[A](runUnsafe: => A): IO[A] = ???
}
