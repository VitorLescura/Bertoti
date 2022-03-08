public class Computador {

   public void start() {
      System.out.println("inicialização inicial");
   }
   public void execute() {
      System.out.println("executa algo no processador");
   }
   public void load() {
      System.out.println("carrega o registrador");
   }
   public void free() {
      System.out.println("libera registradores");
   }
}

public class Memoria {
   public void load(int position, String info) {
      System.out.println("carrega dados na memória");
   }
   public void free(int position, String info) {
      System.out.println("libera dados da memória");
   }
}

public class HD {
   public void read(int startPosition, int size) {
      System.out.println("lê dados do HD");
   }
   public void write(int position, String info) {
      System.out.println("escreve dados no HD");
   }
}

public class ComputadorFacade {
   private Computador cpu = null;
   private Memoria memoria = null;
   private HD hd = null;

   public ComputadorFacade(Computador cpu,
               Memoria memoria,
               HD hd) {
      this.cpu = cpu;
      this.memoria = memoria;
      this.hd = hd;
   }

   public void ligarComputador() {
      cpu.start();
      String hdBootInfo = hd.read(BOOT_SECTOR, SECTOR_SIZE);
      memoria.load(BOOT_ADDRESS, hdBootInfo);
      cpu.execute();
      memoria.free(BOOT_ADDRESS, hdBootInfo);
   }
}
