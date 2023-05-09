package practice;

import java.util.Arrays;

public class testStack {

    public static class Stack {
        int[] array;
        int top = 0;

        public Stack(int i){
            this.array= new int[i];
        }


        public void push(int i) {
            array[top++] = i;
        }

        public int pop() {
            int i = array[top-1];
            array[--top] = 0;
            return i;
        }
    }

    public static void main(String[] args) {
//        father father = new father();
//        father.setFirstName("sam").setLastName("Wang").setAge("30").setSon(new Son1());
//        Son son = new Son();


        Stack stack = new Stack(10);
        stack.push(2);
        stack.push(3);
        stack.push(6);
        System.out.println(Arrays.toString(stack.array) + " === " + stack.top);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(Arrays.toString(stack.array) + " === " + stack.top);




    }
}
