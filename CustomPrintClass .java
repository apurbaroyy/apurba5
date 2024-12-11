class CustomPrintClass {
    
    private String message;
    
    public CustomPrintClass(String message) {
        this.message = message;
    }
    
    public void pr() {
        System.out.println(message);
    }
    
    public static void main(String[] args) {
        CustomPrintClass a = new CustomPrintClass("Hello, World!");
        a.pr(); // Prints: Hello, World!
    }
}
