package tn.esprit.models;

public class Utilisateur {
    private int id, niveauCompetence;
    private String nom, prenom, email, motDePasse, avatar, role;

    public Utilisateur() {}

    public Utilisateur(int id, String nom, String prenom, String email, String motDePasse, String avatar, int niveauCompetence, String role) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.avatar = avatar;
        this.niveauCompetence = niveauCompetence;
        this.role = role;
    }

    public Utilisateur(String nom, String prenom, String email, String motDePasse, String avatar, int niveauCompetence, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePasse = motDePasse;
        this.avatar = avatar;
        this.niveauCompetence = niveauCompetence;
        this.role = role;
    }

    // Getters et Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    public String getPrenom() { return prenom; }
    public void setPrenom(String prenom) { this.prenom = prenom; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getMotDePasse() { return motDePasse; }
    public void setMotDePasse(String motDePasse) { this.motDePasse = motDePasse; }

    public String getAvatar() { return avatar; }
    public void setAvatar(String avatar) { this.avatar = avatar; }

    public int getNiveauCompetence() { return niveauCompetence; }
    public void setNiveauCompetence(int niveauCompetence) { this.niveauCompetence = niveauCompetence; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                "}\n";
    }
}
