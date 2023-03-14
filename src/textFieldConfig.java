/*
*   INTERFAZ ENCARGADA DE IMPLEMENTAR LOS METODOS PARA REINICIAR LOS FORMATOS DE LOS ESPACIOS DE TEXTO
*   INTEGRANTES DEL EQUIPO
*   - Kevin Alan Flores Reyna - 20660053
*   - Angel David Lopez Alvarez - 20660062
*/
public interface textFieldConfig {
    // Metodo global (para todos los que implementen la interfaz) que se encarga de bloquear la edicion del campo de texto
    public void lockTextEdit();
    
    // Metodo global (para todos los que implementen la interfaz) que se encarga de desbloquear la edificion del campo de texto
    public void unlockTextEdit();
    
    // Metodo global (para todos los que implementen la interfaz) clearTextField()
    public void clearTextField();
    
}
