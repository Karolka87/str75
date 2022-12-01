public class Perkusja {
    public static void main(String[] args) {
        PerkusjaSprzet p = new PerkusjaSprzet();
        p.zagrajNaBebnie();
        p.beben = false;
        p.zagrajNaTalerzach();
        if (p.beben == true) {
            p.zagrajNaBebnie();
        }
    }
}
class PerkusjaSprzet {
    boolean talerze = true;
    boolean beben = true;

    void zagrajNaTalerzach() {
        System.out.println("brzdek, brzrzrzdeek");
    }
    void zagrajNaBebnie() {
        System.out.println("bam, bam, baaa-am-am");
    }
}
