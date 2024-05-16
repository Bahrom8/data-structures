public class Test {

    //Define Array
    int[] numbers;
    int size;

    public Test(int[] numbers) {
        this.numbers = new int[10];
        this.size = 0;
    }

    public Test(int capacity) {
        this.numbers = new int[capacity];
        this.size = 0;
    }

    int[] grow(){
        int[] newArray = new int[numbers.length * 2];
        for (int i = 0; i < numbers.length; i++) {
            newArray[i] = numbers[i];
        }
        numbers = newArray;
        return numbers;

        }

    void add (int value){
        //check capacity
        if(size >= (int)numbers.length * 0.75) {
            //grow the arrayList
            numbers = grow(); //this method will return address of new array

        }
        numbers[size++] = value;

    }

    int size(){
        return this.size;
    }

}
