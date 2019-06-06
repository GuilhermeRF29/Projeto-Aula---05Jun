package view;

	import javax.swing.JOptionPane;
	import model.Professor;

public class Execucao {

	public static void main(String[] args) {
		Professor prof = new Professor ();
		
		int cont = 0;
		int cunt = 0;
		
		String disc [] = new String [100];
		String curs [] = new String [100];
		
		prof.setNome(JOptionPane.showInputDialog (null, "Nome"));
		prof.setEndereco(JOptionPane.showInputDialog (null, "Endereço"));
		prof.setBairro(JOptionPane.showInputDialog (null, "Bairro"));
		prof.setCep(Integer.parseInt(JOptionPane.showInputDialog (null, "CEP")));
		prof.setCidade(JOptionPane.showInputDialog (null, "Cidade"));
		prof.setEstado(JOptionPane.showInputDialog (null, "Estado"));
		prof.setRg(Integer.parseInt(JOptionPane.showInputDialog (null, "RG")));
		prof.setCpf(Integer.parseInt(JOptionPane.showInputDialog (null, "CPF")));
		
		try {
			int dis = Integer.parseInt (JOptionPane.showInputDialog (null, "Quantas disciplinas você possui ?"));
			String disciplinas [] = new String [100];
			for (int i = 1; i <= dis; i++) {
				disciplinas [i] = JOptionPane.showInputDialog (null, "Digite a disciplina " + i);
				disc [i] = disciplinas [i];
				cont++;
			}
			prof.setDisciplinas (disciplinas);
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			int cur = Integer.parseInt (JOptionPane.showInputDialog (null, "Quantos cursos você possui ?"));
			String cursos [] = new String [100];
			for (int i = 1; i <= cur; i++) {
				cursos [i] = JOptionPane.showInputDialog (null, "Digite o curso " + i);
				curs [i] = cursos [i];
				cunt++;
			}
			prof.setCursos (cursos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		JOptionPane.showMessageDialog(null, "Nome: " + prof.getNome() + "\nEndereço: " + prof.getEndereco() + "\nBairro: "
									+ prof.getBairro() + "\nCEP: "+ prof.getCep() + "\nCidade: " + prof.getCidade() + 
									"\nEstado: " + prof.getEstado() + "\nRG: " + prof.getRg() + "\nCPF: " + prof.getCpf());
		
		for (int i = 1; i <= cont; i++) {
			JOptionPane.showMessageDialog(null, "Suas disciplinas são: " + disc [i]);
		}
		for (int i = 1; i <= cunt; i++) {
			JOptionPane.showMessageDialog(null, "Seus cursos são: " + curs [i]);
		}
	}
}