package datatypes;

import java.util.Stack;

public class StackExamples {

    public static void examplesOfStack() {
        //STACK=LIFO (last in first out)
        //stores objects into a sort of "vertical tower"
        //push() to add to the top
        //pop() to remove from the top
        //Stack is a member of Collection

        //Uses of stacks?
        //1. undo/redo features in text editors
        //2. moving back/forward through browser history
        //3. backtracking algorithms(maze, file directories)
        //4. calling functions

        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        stack.pop();
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        //when you pop the last item from the stack you cant print it like the above ones, because it tries to return the object and there are no object
        System.out.println(stack.peek());
        stack.pop();//in this case my stack is empty, and so I will add them again


        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

        System.out.println(stack.search("Doom"));
        System.out.println(stack.search("FFVII"));//this counts from the top and first one is number 1 not 0
        System.out.println(stack.search("Fallout76"));//if you search a non-member of the stack it returns -1

/*        for (int i=0;i<1000000000;i++){//this consumes your memory, and you will get OutOfMemoryError
            stack.push("Fallout76");
        }*/
    }
}
