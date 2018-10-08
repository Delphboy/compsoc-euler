/**
 * By considering the terms in the Fibonacci sequence whose values do not exceed four million,
   find the sum of the even-valued terms.
 *
 * @author Tarantino O'Connor
 * @version 1 08.10.18
 */
fun main(args:Array<String>)
{
    var previousNumber = 0
    var currentNumber = 1
    var nextNumber = 0
    var sum = 0

    while (nextNumber < 4000000)
    {
        nextNumber = previousNumber + currentNumber
        previousNumber = currentNumber
        currentNumber = nextNumber

        if((nextNumber % 2 == 0)&&(nextNumber < 4000000))
        {
            sum += nextNumber
        }
    }

    println(sum)
}