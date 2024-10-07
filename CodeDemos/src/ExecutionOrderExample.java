public class ExecutionOrderExample {
    static {
        System.out.println("1. Static block");
    }

    private static String staticVariable = getStaticVariable();
    {
        System.out.println("3. Instance initializer block");
    }

    private String instanceVariable = getInstanceVariable();

    public ExecutionOrderExample() {
        System.out.println("4. Constructor");
    }

    public static void staticMethod() {
        System.out.println("2. Static method");
    }

    public void instanceMethod() {
        System.out.println("5. Instance method");
    }

    private static String getStaticVariable() {
        System.out.println("6. Static variable initialization");
        return "initialized";
    }

    private String getInstanceVariable() {
        System.out.println("7. Instance variable initialization");
        return "initialized";
    }

    public static void main(String[] args) {
        staticMethod();
        ExecutionOrderExample example = new ExecutionOrderExample();
        example.instanceMethod();
    }
}
