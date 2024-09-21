public class Zapatos {
    public String Color;
    public String Material;
    public int Talla;
    public String Tipo;

    public Zapatos(String color, String material, int talla, String tipo) {
        this.Color = color;
        this.Material = material;
        this.Talla = talla;
        this.Tipo = tipo;
    }

    public String getColor() {
        return Color;
    }

    public String getMaterial() {
        return Material;
    }

    public int getSize() {
        return Talla;
    }

    public String getType() {
        return Tipo;
    }
}
