package com.company.LiskovsSubstitutivityPrinciple;

 class Rectangle {
    private int length;
    private int breadth;
    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int getArea() {
        return this.length * this.breadth;
    }
}
 class Square extends Rectangle {
    @Override
    public void setBreadth(int breadth) {
        super.setBreadth(breadth);
        super.setLength(breadth);
    }
    @Override
    public void setLength(int length) {
        super.setLength(length);
        super.setBreadth(length);
    }
}

public class LSPDemo {
    /**
     * One should note that as per the definition of Rectangle, following must always hold true given the data below:
     * 1. Length must always be equal to the length passed as the input to method, setLength
     * 2. Breadth must always be equal to the breadth passed as input to method, setBreadth
     * 3. Area must always be equal to product of length and breadth
     *
     * In case, we try to establish ISA relationship between Square and Rectangle such that we call "Square is a Rectangle",
     * below code would start behaving unexpectedly if an instance of Square is passed
     * Assertion error will be thrown in case of check for area and check for breadth, although the program will terminate as
     * the assertion error is thrown due to failure of Area check.
     *
     * @param r Instance of Rectangle
     */
    public void calculateArea(Rectangle r) {
        r.setBreadth(2);
        r.setLength(3);
        // Assert Area From the code, the expected behavior is that
        // the area of the rectangle is equal to 6
        assert r.getArea() == 6 : printError("area", r);
        System.out.println(r.getArea());
        System.out.println("Area"+r.getArea());
        // Assert Length & Breadth. From the code, the expected behavior is that the length should always be equal to 3 and
        // the breadth should always be equal to 2
        assert r.getLength() == 3 : printError("length", r);
        System.out.println("Length"+r.getLength());

        assert r.getBreadth() == 2 : printError("breadth", r);
        System.out.println("Breadth"+r.getBreadth());
    }
    private String printError(String errorIdentifer, Rectangle r) {
        return "Unexpected value of " + errorIdentifer + "  for instance of " + r.getClass().getName();
    }
    public static void main(String[] args) {
        LSPDemo lsp = new LSPDemo();
        // An instance of Rectangle is passed
        lsp.calculateArea(new Rectangle());
        // An instance of Square is passed
        lsp.calculateArea(new Square());
    }
}
