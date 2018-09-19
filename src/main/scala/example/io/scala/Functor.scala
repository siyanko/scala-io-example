package example.io.scala

trait Functor[F[_]] {
  def fmap[A, B](f: A => B): F[A] => F[B]
}

object Functor {
  def apply[F[_]](implicit F: Functor[F]): Functor[F] = F
}
