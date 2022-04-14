fun main(){
    var deposit = 12000
    println(deposit)
    var withdrawal = 6000
    println(withdrawal)




}

class currentAccount(var accountNumber: String, var accountName: String, var balance: Double){

    fun deposit(amount: Double){
       var deposit = amount
        balance += amount
        println(deposit)

    }
    fun withdrawal(amount: Double){
        var withdrawal = amount
        balance -= amount
        println(withdrawal)
    }

    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }

}

class savingsAccount(var accountNumber: String, var accountName: String, var balance: Double){
    fun deposit(amount: Double){
        var deposit = amount
        balance += amount
        println(deposit)

    }
    fun withdrawal(amount: Double){
        var withdrawal = amount
        balance -= amount
        println(withdrawal)
    }

    fun details(){
        println("Account number $accountNumber with balance $balance is operated by $accountName")
    }
    fun withdrawals(amount: Int): Int{
        var total = 0
        total ++
        println(total)



data class user(var name: String, var weight: Int, var price: Int, var category: String){
    fun statement(){

    }
}


}
fun evenChar(name: String): String {
    var char = 0
    if (char % 2 != 0) {
        println(char)
    }
    return name
}
