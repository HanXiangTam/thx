package crazyJvm.lesson1

object lesson1_4 {

  def reverse(array : Array[Int]){
    for(i<-0 until array.length-1){
      if(i%2 == 0){
        var temp = array(i);
        array(i) = array(i+1);
        array(i+1) = temp;
      }
    }
    
    for(i<- 0 until array.length){
      println(array(i));
    }
  }
  
  def main(args: Array[String]): Unit = {
    reverse(Array(1,2,3,4,5));
  }

}