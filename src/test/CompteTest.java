package test;

import main.Compte;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompteTest {
    Compte compte;

    @BeforeEach
    void setUp() {
        compte = new Compte(1111, 2000);
    }

    @AfterEach
    void tearDown() {
        compte = null;
    }

    @Test
    void solde() {
        System.out.println(compte.solde());
        assertEquals(2000, compte.solde());
    }

    @Test
    void client() {
        System.out.println(compte.client());
        assertEquals(1111, compte.client());
    }

    @Test
    void deposer() {
        System.out.println(compte.solde());
        compte.deposer(100);
        assertEquals(2100, compte.solde());
    }

    @Test
    void retirer() {
        System.out.println(compte.solde());
        compte.retirer(100);
        assertEquals(1900, compte.solde());
    }
}