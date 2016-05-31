package crazyJvm.lesson1

object lesson1_1 {
  def judge(num:Double){
    var i=0;
    if(num >0){
      i=1;
    }else if(num <0){
      i= -1;
    }else{
      i=0;
    }
    println(i);
    i;
  }
  def main(args: Array[String]): Unit = {
    judge(2);
    judge(-5);
    judge(0);
  }

}