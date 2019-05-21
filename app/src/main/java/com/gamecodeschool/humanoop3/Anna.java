package com.gamecodeschool.humanoop3;

public class Anna extends Human {
    private int height;

    public Anna(String name, int weight, int age, int height) {
        super(name, weight, age);
        this.height = height;
    }

    public Anna(String name, int weight, int age) {
        super(name, weight, age);
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void eat() {
       super.eat();
       int AnnaWeight = getWeight();
       AnnaWeight = AnnaWeight + 2;
       setWeight(AnnaWeight);

    }

    @Override
    public void birthday() {
//
        int AnnaAge =  getAge();
        AnnaAge = AnnaAge + 4;
        setAge(AnnaAge);
    }
}
