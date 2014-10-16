import com.typesafe.akka.extension.quartz.QuartzSchedulerExtension
object Hi {
  def main(args: Array[String]) = {

    // スケジューラを生成
    val scheduler = QuartzSchedulerExtension(_system)
    // アクターをスケジューリング
    scheduler.schedule(
      "Every15Seconds",                       // アクターの名前
      Akka.system.actorOf(Props[HelloActor]), // ActorRef
      "Hello"                                 // アクターに送信するメッセージ
    )
  }
}
