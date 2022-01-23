package banco;

public class ContaBanco {
    
    //Atributos da conta
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //construtor

    public ContaBanco(int numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    
    //métodos personalizados
    
    public void estadoConta(){
        System.out.println("Conta: " +this.getNumConta());
        System.out.println("Tipo: " +this.getTipo());
        System.out.println("Dono: " + this.getDono());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Status: " +this.getStatus());
    }
    
    public void abrirConta(){
        
        this.setTipo(tipo);
        this.setStatus(true);
        
        if ("CC".equals(tipo)) {
            this.setSaldo(50);
            System.out.println("Abertura de conta para " + this.dono);
            System.out.println("Conta aberta com sucesso.");
            System.out.println("---------");
            estadoConta();
        } else if("CP".equals(tipo)){
            this.setSaldo(150);
            System.out.println("Abertura de conta para " + this.dono);
            System.out.println("Conta aberta com sucesso.");
            System.out.println("---------");
            estadoConta();
        }
        
         if(!"CC".equals(tipo) && !"CP".equals(tipo)){
            this.setTipo(tipo);
            this.setStatus(false);
            System.out.println("Abertura de conta para " + this.dono);
            System.out.println("Erro ao abrir a conta. Verifique se a conta foi criada nos tipos CC ou CP.");
        }   System.out.println("---------");
         
      
        
    }
    
    public void fecharConta(){
        
        if(this.getSaldo() > 0){
            System.out.println("Conta não pode ser fechada, saldo ainda disponível");
            
        } else if(this.getSaldo() < 0 ){
            System.out.println("Conta não pode ser fechada, em débito.");
        } else{
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
        
    }
    
    public void depositar(float val){
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()+val);
            System.out.println("Depósito na conta de " + this.getDono());
            System.out.println("Saldo atual:" + this.getSaldo());
            System.out.println("---------");
        }else{
            System.out.println("Depósito na conta de " + this.getDono());
            System.out.println("Não é possível depositar em uma conta fechada.");
            System.out.println("---------");
        }
    }
    
    public void sacar(float val){
        if(this.getStatus()){
            if(this.getSaldo() >= val){
                this.setSaldo(this.getSaldo() - val);
                System.out.println("Saque na conta de " + this.dono);
                System.out.println("Saldo atual:" + this.getSaldo());
                System.out.println("---------");
            }else{
                
                System.out.println("Saque na conta de " + this.dono);
                System.out.println("Saldo insuficiente para saque.");
                System.out.println("---------");
            }
        }else{
            System.out.println("Saque na conta de " + this.dono);
            System.out.println("Não é possível sacar de uma conta fechada.");
            System.out.println("---------");
        }
    }
    
    public void pagarMensalidade(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;
        } else if("CP".equals(this.getTipo())){
            v=20;
        }
        if(this.getStatus()){
            this.setSaldo(this.getSaldo()- v);
        }else{
            System.out.println("Não é possível pagar a mensalidade de uma conta fechada.");
        }
    }
    
    //getters e setters

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
        
}
