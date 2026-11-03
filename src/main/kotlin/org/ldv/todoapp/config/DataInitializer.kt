package org.ldv.todoapp.config
import org.ldv.todoapp.model.entity.Role
import org.ldv.todoapp.model.entity.Utilisateur
import org.ldv.todoapp.model.entity.Tache
import org.ldv.todoapp.model.repository.RoleRepository
import org.ldv.todoapp.model.repository.UtilisateurRepository
import org.ldv.todoapp.model.repository.TacheRepository
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component
import java.time.LocalDate
@Component
class DataInitializer(
    private val roleRepository: RoleRepository,
    private val utilisateurRepository: UtilisateurRepository,
    private val tacheRepository: TacheRepository
) : CommandLineRunner {
    override fun run(vararg args: String) {
// Initialisation uniquement si les tables sont vides
        if (roleRepository.count() > 0 ||
            utilisateurRepository.count() > 0 ||
            tacheRepository.count() > 0
        ) {
            println("Base de données déjà initialisée.")
            return
        }
        println("Initialisation des données TodoApp...")
// 1. Création des rôles
        val roleUser = roleRepository.save(
            Role(nom = "ROLE_USER")
        )
        val roleAdmin = roleRepository.save(
            Role(nom = "ROLE_ADMIN")
        )
        // 2. Création des utilisateurs
        val alice = utilisateurRepository.save(
            Utilisateur(
                nom = "Martin",
                prenom = "Alice",
                email = "alice@example.com",
                role = roleUser
            )
        )
            val bob = utilisateurRepository.save(
                Utilisateur(
                    nom = "Durand",
                    prenom = "Bob",
                    email = "bob@example.com",
                    role = roleUser
                )
            )
    }
}
