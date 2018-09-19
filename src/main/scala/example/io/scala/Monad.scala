package example.io.scala

trait Monad[F[_]] extends Applicative[F] {

  def bind[A, B](fa: F[A])(f: A => F[B]): F[B]
}

object Monad {
  def apply[F[_]](implicit F: Monad[F]): Monad[F] = F
}
