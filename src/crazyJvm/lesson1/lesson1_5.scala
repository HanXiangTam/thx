package crazyJvm.lesson1

object lesson1_5 {
  
  def participle(text:String) : Map[String,Int] ={
   val words = scala.collection.mutable.Map[String,Int]();
   for(word <- text.split(' ')){
     if(words.contains(word)){
       words(word) =  words(word)+1;
     }else{
       words += (word->1);
     }
   }
   words.toMap;
  }
  
  def main(args: Array[String]) {
    
  }
}