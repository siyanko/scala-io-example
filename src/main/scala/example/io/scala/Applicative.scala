package example.io.scala

trait Applicative[F[_]] extends Functor[F]{

  def point[A](a: A): F[A]

}

object Applicative{
  def apply[F[_]](implicit F: Applicative[F]): Applicative[F] = F
}
