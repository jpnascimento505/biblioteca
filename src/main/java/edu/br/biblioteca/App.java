package edu.br.biblioteca;

import edu.br.biblioteca.modelo.Usuario;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Usuario usuario = new Usuario();
        usuario.setEmail("teste@teste.com");
        usuario.setMatricula("000000");
        usuario.setSenha("123");
    }
}
