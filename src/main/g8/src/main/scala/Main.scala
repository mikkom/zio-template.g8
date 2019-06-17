package hello

import scalaz.zio.App
import scalaz.zio.console.{putStrLn, getStrLn}

object Main extends App {

  def run(args: List[String]) =
    myAppLogic.fold(_ => 1, _ => 0)

  val myAppLogic =
    for {
      _ <- putStrLn("Hello! What is your name?")
      n <- getStrLn
      _ <- putStrLn(s"Hello, welcome to ZIO!")
    } yield ()
}
