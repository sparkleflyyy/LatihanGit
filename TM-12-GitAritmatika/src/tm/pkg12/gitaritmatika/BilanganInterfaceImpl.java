package tm.pkg12.gitaritmatika;

/**
 *
 * @author riyann
 */
public class BilanganInterfaceImpl implements BilanganInterface{

    @Override
    public double add(Bilangan bilangan) {
    return bilangan.getBilangan1() + bilangan.getBilangan2();
    }

    @Override
    public double sub(Bilangan bilangan) {
        return bilangan.getBilangan1() / bilangan.getBilangan2();
    }

    @Override
    public double mult(Bilangan bilangan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double div(Bilangan bilangan) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
   
}
