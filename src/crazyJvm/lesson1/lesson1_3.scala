package crazyJvm.lesson1

object lesson1_3 {

  def countdown(n : Int){
    if(n >1){
      Range(n-1,-1,-1).foreach(e => println(e));
    }else{
      println("error");
    }
  }
  
  def main(args: Array[String]): Unit = {
    countdown(10);
  }
}