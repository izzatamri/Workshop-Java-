package tn.esprit.services;

import tn.esprit.interfaces.IService;
import tn.esprit.models.Utilisateur;
import tn.esprit.utils.MyDatabase;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ServiceUtilisateur implements IService<Utilisateur> {
    private Connection cnx;

    public ServiceUtilisateur() {
        cnx = MyDatabase.getInstance().getCnx();
    }

    @Override
    public void add(Utilisateur utilisateur) {
        String qry = "INSERT INTO utilisateur (Nom, Prenom, Email, Mot_de_passe, Avatar, Niveau_competence, Role) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setString(1, utilisateur.getNom());
            pstm.setString(2, utilisateur.getPrenom());
            pstm.setString(3, utilisateur.getEmail());
            pstm.setString(4, utilisateur.getMotDePasse());
            pstm.setString(5, utilisateur.getAvatar());
            pstm.setInt(6, utilisateur.getNiveauCompetence());
            pstm.setString(7, utilisateur.getRole());
            pstm.executeUpdate();
            System.out.println("✅ Utilisateur ajouté avec succès !");
        } catch (SQLException e) {
            System.out.println("❌ Erreur lors de l'ajout : " + e.getMessage());
        }
    }

    @Override
    public List<Utilisateur> getAll() {
        List<Utilisateur> utilisateurs = new ArrayList<>();
        String qry = "SELECT * FROM utilisateur";
        try {
            Statement stm = cnx.createStatement();
            ResultSet rs = stm.executeQuery(qry);
            while (rs.next()) {
                Utilisateur u = new Utilisateur(
                        rs.getInt("ID"),
                        rs.getString("Nom"),
                        rs.getString("Prenom"),
                        rs.getString("Email"),
                        rs.getString("Mot_de_passe"),
                        rs.getString("Avatar"),
                        rs.getInt("Niveau_competence"),
                        rs.getString("Role")
                );
                utilisateurs.add(u);
            }
        } catch (SQLException e) {
            System.out.println("❌ Erreur lors de la récupération : " + e.getMessage());
        }
        return utilisateurs;
    }

    @Override
    public void update(Utilisateur utilisateur) {
        String qry = "UPDATE utilisateur SET Nom = ?, Prenom = ?, Email = ?, Mot_de_passe = ?, Avatar = ?, Niveau_competence = ?, Role = ? WHERE ID = ?";
        try {
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setString(1, utilisateur.getNom());
            pstm.setString(2, utilisateur.getPrenom());
            pstm.setString(3, utilisateur.getEmail());
            pstm.setString(4, utilisateur.getMotDePasse());
            pstm.setString(5, utilisateur.getAvatar());
            pstm.setInt(6, utilisateur.getNiveauCompetence());
            pstm.setString(7, utilisateur.getRole());
            pstm.setInt(8, utilisateur.getId());
            pstm.executeUpdate();
            System.out.println("✅ Utilisateur mis à jour !");
        } catch (SQLException e) {
            System.out.println("❌ Erreur lors de la mise à jour : " + e.getMessage());
        }
    }

    @Override
    public void delete(int id) {
        String qry = "DELETE FROM utilisateur WHERE ID = ?";
        try {
            PreparedStatement pstm = cnx.prepareStatement(qry);
            pstm.setInt(1, id);
            pstm.executeUpdate();
            System.out.println("✅ Utilisateur supprimé !");
        } catch (SQLException e) {
            System.out.println("❌ Erreur lors de la suppression : " + e.getMessage());
        }
    }
}
