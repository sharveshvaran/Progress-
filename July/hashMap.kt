fun main(){
    val score = hashMapOf(Pair("liverpool",3),Pair("Tottenham",0),Pair("Manchester United",1))
    println(score)
    println(score["liverpool"])
    score["manchester City"] = 3
    println(score)
    //in hashmap we can add or delete pairs
    // keys must be unique
    //values can be of duplicates
    //keys can be of sets
    println(score.keys)
    println(score.values)

}