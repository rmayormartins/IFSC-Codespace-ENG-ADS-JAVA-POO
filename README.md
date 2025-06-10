<table align="center" border="1" cellpadding="5" cellspacing="0" style="border-collapse: collapse; border: 1px solid black;">
  <tr>
    <td style="border: 1px solid black; padding: 5px;">
      <p style="text-align: center;">Bem vindos ao Repositório</p>
      <p style="text-align: center;">IFSC-Codespace-ENG-ADS-JAVA-POO</p>
      <p style="text-align: center;"><a href="https://rmayormartins.github.io/" target="_blank">Prof. Dr. Ramon Mayor Martins</a></p>
    </td>
  </tr>
</table>

---

#### IFSC-Codespace-ENG-ADS-JAVA-POO

Bem-vindos ao Repositório [IFSC-Codespace-ENG-ADS-JAVA-POO](https://github.com/rmayormartins/IFSC-Codespace-ENG-ADS-JAVA-POO)

---

#### Sobre o Repositório

Este repositório contém exemplos e projetos desenvolvidos em Java como parte dos cursos Engenharia de Telecomunicações e Análise e Desenvolvimento de Sistemas no [IFSC - Instituto Federal de Santa Catarina](https://www.ifsc.edu.br/).

---

#### Tech Stack

[![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?logo=openjdk&logoColor=white)](#)
[![GitHub](https://img.shields.io/badge/GitHub-%23121011.svg?logo=github&logoColor=white)](#)
[![GitHub Codespace](https://img.shields.io/badge/GitHub-Codespace-blue)](#)

---

#### Configuração do Ambiente de Desenvolvimento

Para começar a trabalhar neste projeto, siga os passos abaixo:

##### 1. Fork do Repositório

- Acesse este repositório no GitHub.
- Clique no botão "Fork" no canto superior direito para criar uma cópia do repositório em sua conta.

##### 2. Criação do Codespace

- No seu fork do repositório, clique no botão verde "Code".
- Selecione a aba "Codespaces".
- Clique em "Create codespace on main" para criar um novo ambiente de desenvolvimento.

##### 3. Configuração do Ambiente Java

- O Codespace será iniciado com as configurações Java predefinidas.
- Aguarde a conclusão da configuração automática do ambiente.

##### 4. Teste do Ambiente

- No explorador de arquivos do Codespace, crie um novo arquivo chamado `HelloWorld.java`.
- Copie e cole o seguinte código:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, GitHub Codespaces!");
    }
}
```

- Para compilar e executar o programa, você tem duas opções:
- Use o botão "Run" (▶️) no Codespace para compilar e executar diretamente.
- Ou use os seguintes comandos no terminal:

```bash
javac HelloWorld.java
java HelloWorld
```
ou (quando várias classes em arquivos distintos)
```bash
javac *.java
java HelloWorld
```
---
#### 🧰🛠️ Ajuste caso necessário

- Atualizar os pacotes
```bash
sudo apt update
#Instalar OpenJDK 17 (versão LTS recomendada)
sudo apt install openjdk-17-jdk -y
#Verificar se foi instalado corretamente
java -version
javac -version
echo $JAVA_HOME
```
- Em caso de Recuperation mode: Comandos básicos de diagnostico
```bash
# Verificar status dos serviços
sudo systemctl status

# Verificar espaço em disco
df -h

# Verificar uso de memória
free -h

# Verificar processos em execução
ps aux

# Verificar logs do sistema
sudo journalctl -f
```
- Em caso de Recuperation mode: Comandos de recuperação comuns
```bash
# Reiniciar serviços do VS Code
sudo systemctl restart code-server

# Limpar cache do npm (se usando Node.js)
npm cache clean --force

# Limpar arquivos temporários
sudo apt clean
sudo apt autoremove

# Resetar permissões do workspace
sudo chown -R $(whoami):$(whoami) /workspaces

# Verificar e reparar sistema de arquivos
sudo fsck -f /dev/sda1
```
- Em caso de Recuperation mode: Para problemas específicos
```bash
# Ctrl + C para cancelar processo atual
# Ctrl + Z para suspender processo
# Ctrl + D para sair do shell atual
```
- Em caso de Recuperation mode: Se há problemas de rede
```bash
# Testar conectividade
ping google.com

# Reiniciar serviços de rede
sudo systemctl restart systemd-networkd
```
- Em caso de Recuperation mode: Recovery mode completo
```bash
# Modo de emergência - usar apenas se necessário
sudo systemctl rescue

# Para sair do modo de emergência
sudo systemctl default
```

---

#### Estrutura do Repositório

- Contém os arquivos fonte (.java) dos projetos e exemplos.

---

#### Cheat sheet de git no terminal

- ```git add .``` ou ```git add file.java```
- ```git status```
- ```git commit -m "add versao x"```
- ```git push -u origin main```

---

#### Recursos Adicionais

- [Documentação Oracle Java](https://dev.java/learn/)
- [Documentação Oracle Java Language Specification](https://docs.oracle.com/javase/specs/jls/se22/jls22.pdf)
- [Java Cheat Sheet](https://introcs.cs.princeton.edu/java/11cheatsheet/)
- [GitHub Codespaces Documentation](https://docs.github.com/en/codespaces)

---

#### Contribuindo

Sinta-se à vontade para contribuir com este repositório! Você pode:

- Abrir ```issues``` para reportar problemas ou sugerir melhorias.
- Submeter ```pull requests``` com novos exemplos ou correções.
- Melhorar a documentação existente.
- Ou entrar em contato ```ramon.mayor at: ifsc.edu.br```

---

#### 🧰 Mantenedor
```
Prof. Dr. Ramon Mayor Martins
Professor do IFSC - Campus São José
Áreas: Programação, Algoritmos e Estruturas de Dados
[Website Pessoal](https://rmayormartins.github.io/)
```
---

#### 📝 Licença

Este repositório e seus projetos estão sob licença específica. Consulte cada projeto individual para mais detalhes.

---
<div align="center">
  
#### IFSC-Codespace-ENG-ADS-JAVA-POO

</div>


