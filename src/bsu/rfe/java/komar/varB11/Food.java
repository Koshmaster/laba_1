package bsu.rfe.java.komar.varB11;

public abstract class Food implements Consumable, Nutritious
{
    String name = null;
    String size = null;
    double calories = 0;
    String par1 = null;
    public void consume(){}
    public Food(String name)
    {
        this.name = name;
    }
/*fixed*/
    public String toString()        // перегружен метод преобразования в строку
    {
        return name;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false; //
        if (name == null || ((Food) arg0).name == null) return false;
        return name.equals(((Food)arg0).name);
    }

    public String getName()        // возвращает имя
    {
        return name;
    }

    public void setName(String name)        // для изменения имени
    {
        this.name = name;
    }

}
