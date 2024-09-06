public class Cat {
    private String name;

    public void meow() {
        System.out.println(name + "~~~~~" + "웁니다.");
    }

    public Cat(String name) {
        this.name = name;
    }
}