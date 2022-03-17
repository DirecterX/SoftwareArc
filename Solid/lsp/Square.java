package solid_lsp;

public class Square extends Rectangle {

    Square(int side) {
        this.setWidth(side);
        this.setHeight(side);
    }

    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width); //<<--- when set width or height for sqare it should be the same value
    }

    @Override
    public void setHeight(int height) {
        super.setWidth(height); //<<--- when set width or height for sqare it should be the same value
        super.setHeight(height);
    }
}
