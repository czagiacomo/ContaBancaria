package conta.util;

public class Designs {
	
	public static void about() {
		System.out.println(Cores.TEXT_GREEN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Catharina Zagiacomo");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************" + Cores.TEXT_RESET);
	}
	
	public static void javaLogo(){
		
		System.out.println(Cores.ANSI_BLACK_BACKGROUND + Cores.TEXT_RED_BOLD
				+ "                                                                    \r\n"
				+ "                                      #                             \r\n"
				+ "                                      ##                            \r\n"
				+ "                                      ##                            \r\n"
				+ "                                     ##                             \r\n"
				+ "                                   ###                              \r\n"
				+ "                                 ####                               \r\n"
				+ "                              #####    ###                          \r\n"
				+ "                            #####   ####                            \r\n"
				+ "                           ####   ####                              \r\n"
				+ "                          ####   ###                                \r\n"
				+ "                          ###    ###                                \r\n"
				+ "                           ##    #####                              \r\n"
				+ "                            ###   #####                             \r\n"
				+ "                             ###   ####                             \r\n"
				+ "                               ##   ###                             \r\n"
				+ Cores.TEXT_BLUE_BOLD +"                    ****          " + Cores.TEXT_RED_BOLD  + "##" + Cores.TEXT_BLUE_BOLD +"           ***                  \r\n"
				+ "                 *******       ***********      ***                 \r\n"
				+ "                    ***************             ***                 \r\n"
				+ "                      **                       ***                  \r\n" 
				+ "                     ********************   ***                     \r\n"
				+ "                           ******                                   \r\n"
				+ "                       **                                           \r\n"
				+ "                       *****************                            \r\n"
				+ "                *****     **********           **                   \r\n"
				+ "             ****                            ****                   \r\n"
				+ "              ******************************    ***                 \r\n"
				+ "                    **                 *********                    \r\n"
				+ "                        ****************                            \r\n"
				+ "                                                                    \r\n"
				+ Cores.TEXT_RED_BOLD  + "              ###                                                   \r\n"
				+ "              ###                                                   \r\n"
				+ "              ###   #######  ###     ###  ####### TM                \r\n"
				+ "              ###  #########  ###   #### #########                  \r\n"
				+ "              ###        ###  ####  ###        ###                  \r\n"
				+ "              ###   ########   ###  ###   ########                  \r\n"
				+ "              ###  ###   ###   #######  ####   ###                  \r\n"
				+ "              ### ####  ####    ######  ####  ####                  \r\n"
				+ "              ###  #########     ####    #########                  \r\n"
				+ "             ####                                                   \r\n"
				+ "            ####                                                    \r\n"
				+ "                                                                    " + Cores.TEXT_RESET);
		
	}

	public static void await() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public static void accountView() {
		System.out.println(Cores.TEXT_GREEN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND + "\n\n ╔════════════════════════════════════════════════════════════════╗ ");
		System.out.println("                           Dados da Conta:                          ");
		System.out.println(" ╚════════════════════════════════════════════════════════════════╝ ");
		
	}
	
	public static void intro() {
		
	}
	
	public static void menu() {
		System.out.println(Cores.TEXT_GREEN_BRIGHT + Cores.ANSI_BLACK_BACKGROUND
				+ "                                                                    ");
		System.out.println(" ╔════════════════════════════════════════════════════════════════╗ ");
		System.out.println(""
				+ " ║      ______                         _____ _                    ║ \r\n"
				+ " ║      | ___ \\                       /  ___| |                   ║ \r\n"
				+ "‎ ║      | |_/ / __ _ _ __   ___ ___   \\ `--.| |_ _   ___  __      ║ \r\n"
				+ "‎ ║      | ___ \\/ _` | '_ \\ / __/ _ \\   `--. \\ __| | | \\ \\/ /      ║ \r\n"
				+ "‎ ║      | |_/ / (_| | | | | (_| (_) | /\\__/ / |_| |_| |>  <       ║ \r\n"
				+ "‎ ║      \\____/ \\__,_|_| |_|\\___\\___/  \\____/ \\__|\\__, /_/\\_\\      ║ \r\n"
				+ " ║                                                __/ |           ║ \r\n"
				+ " ║                                               |___/            ║ ");
		System.out.println(" ╠════════════════════════════════════════════════════════════════╣ ");
		System.out.println(" ║                                                                ║ ");
		System.out.println(" ║                  1 - Criar Conta                               ║ ");
		System.out.println(" ║                  2 - Listar todas as Contas                    ║ ");
		System.out.println(" ║                  3 - Buscar Conta por Número                   ║ ");
		System.out.println(" ║                  4 - Atualizar Dados da Conta                  ║ ");
		System.out.println(" ║                  5 - Apagar Conta                              ║ ");
		System.out.println(" ║                  6 - Sacar                                     ║ ");
		System.out.println(" ║                  7 - Depositar                                 ║ ");
		System.out.println(" ║                  8 - Tranferência                              ║ ");
		System.out.println(" ║                  9 - Criar Contas de Teste                     ║ ");
		System.out.println(" ║                  0 - Sair                                      ║ ");
		System.out.println(" ║                                                                ║ ");
		System.out.println(" ╚════════════════════════════════════════════════════════════════╝ ");
		System.out.println("                                                                    "+ Cores.TEXT_RESET);
	}
}

/*
______                         _____ _              
| ___ \                       /  ___| |             
| |_/ / __ _ _ __   ___ ___   \ `--.| |_ _   ___  __
| ___ \/ _` | '_ \ / __/ _ \   `--. \ __| | | \ \/ /
| |_/ / (_| | | | | (_| (_) | /\__/ / |_| |_| |>  < 
\____/ \__,_|_| |_|\___\___/  \____/ \__|\__, /_/\_\
                                          __/ |     
                                         |___/      
*/