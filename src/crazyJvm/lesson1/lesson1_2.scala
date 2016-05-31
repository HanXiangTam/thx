package crazyJvm.lesson1

object lesson1_2 {

  def main(args: Array[String]): Unit = {
    var i = 10;
    /*while(i > -1){
      println("i is " +i);
      i=i-1;
    }*/
    Range(i,0,-1).foreach(e => println(e));
  }

}