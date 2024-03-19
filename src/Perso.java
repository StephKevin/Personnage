public class Perso {
    private String nomPers;
    private int partieJouer;
    private int nbrVictoire;
    private int nbrDefaite;
    private String nivPerso;
    public Perso(){
        System.out.println("Création d'un perso par défaut");
        nomPers ="Inconue";
        partieJouer = 0;
        nbrVictoire = 0;
        nbrDefaite = 0;
        this.setNivPerso();
    }
    public Perso(String nPers, int pJouer, int nVictoire, int nDefaite){
        System.out.println("Création de perso avec ses paramètres");
        nomPers = nPers;
        partieJouer = pJouer;
        nbrVictoire = nVictoire;
        nbrDefaite = nDefaite;
        this.setNivPerso();
    }
/***************************************************************************
            GETERS
 **************************************************************/
    public String getNomPers() {
        return nomPers;
    }
    public int getPartieJouer() {
        return partieJouer;
    }
    public int getNbrVictoire() {
        return nbrVictoire;
    }

    public int getNbrDefaite() {
        return nbrDefaite;
    }
    public String getNivPerso() {
        return nivPerso;
    }
    /*******************************************************************************
        STERS
     *****************************************************************/
    public void setNomPers(String nomPers) {
        this.nomPers = nomPers;
    }

    public void setPartieJouer(int partieJouer) {
        this.partieJouer = partieJouer;
        this.setNivPerso();
    }

    public void setNbrVictoire(int nbrVictoire) {
        this.nbrVictoire = nbrVictoire;
        this.setNivPerso();
    }

    public void setNbrDefaite(int nbrDefaite) {
        this.nbrDefaite = nbrDefaite;
        this.setNivPerso();
    }
    private void setNivPerso(){
        int bornes;
        int paJ;//partie jouer
        int i = 0;
        String niveau[]={"Debutant","Intermediaire","Pro","Legndaire"};
        bornes = this.nbrVictoire - this.nbrDefaite;
        paJ = this.partieJouer;
        while (i< niveau.length)
        {
            if (bornes<0)//<>
            {
                this.nivPerso = niveau[i];
            }
            else if (paJ<=10 && bornes>0){this.nivPerso = niveau[i];}
            else if (paJ>10 && paJ<=30 && bornes>0){
                i++;
                this.nivPerso = niveau[i];
            }
            else if(paJ>30 && paJ<=70 && bornes>0){
                i++;
                this.nivPerso = niveau[i];
            }
            else {
                i++;
                this.nivPerso = niveau[i];
            }
            break;
        }
    }
    public String Description(){
        return "\tDescription du joueur:\n\t\tNom du personnage: "+this.nomPers+"\n\t\tNombre de partie jouer: "+this.partieJouer+
                "\n\t\tNombre de victoire: "+this.nbrVictoire+"\n\t\tNombre de défaite: "+this.nbrDefaite+
                "\n\t\tNiveau du joueur: "+this.nivPerso;
    }
}
