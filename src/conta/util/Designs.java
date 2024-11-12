package conta.util;

public class Designs {
	
	public static void javaLogo(){
		
		System.out.println(Cores.TEXT_RED_BOLD + "                         #              \r\n"
				+ "                         ##             \r\n"
				+ "                         ##             \r\n"
				+ "                        ##              \r\n"
				+ "                      ###               \r\n"
				+ "                    ####                \r\n"
				+ "                 #####    ###           \r\n"
				+ "               #####   ####             \r\n"
				+ "              ####   ####               \r\n"
				+ "             ####   ###                 \r\n"
				+ "             ###    ###                 \r\n"
				+ "              ##    #####               \r\n"
				+ "               ###   #####              \r\n"
				+ "                ###   ####              \r\n"
				+ "                  ##   ###              \r\n"
				+ Cores.TEXT_BLUE_BOLD +"        ****          " + Cores.TEXT_RED_BOLD  + "##" + Cores.TEXT_BLUE_BOLD +"           ***  \r\n"
				+ "     *******       ***********      *** \r\n"
				+ "        ***************             *** \r\n"
				+ "          **                       ***  \r\n"
				+ "         ********************   ***     \r\n"
				+ "               ******                   \r\n"
				+ "           **                           \r\n"
				+ "           *****************            \r\n"
				+ "    *****     **********           **   \r\n"
				+ " ****                            ****   \r\n"
				+ "  ******************************    *** \r\n"
				+ "        **                 *********    \r\n"
				+ "            ****************            \r\n"
				+ "                                        \r\n"
				+ Cores.TEXT_RED_BOLD  + "  ###                                   \r\n"
				+ "  ###                                   \r\n"
				+ "  ###   #######  ###     ###  ####### TM\r\n"
				+ "  ###  #########  ###   #### #########  \r\n"
				+ "  ###        ###  ####  ###        ###  \r\n"
				+ "  ###   ########   ###  ###   ########  \r\n"
				+ "  ###  ###   ###   #######  ####   ###  \r\n"
				+ "  ### ####  ####    ######  ####  ####  \r\n"
				+ "  ###  #########     ####    #########  \r\n"
				+ " ####                                   \r\n"
				+ "####                                    \r\n"
				+ "" + Cores.TEXT_RESET);
		
		System.out.println("Esse programa foi desenvolvido em Java... Aguarde sua inicialização");
		
	}

	public static void await() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
