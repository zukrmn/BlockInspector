# BlockInspector

BlockInspector é um plugin para servidores Bukkit que permite inspecionar informações técnicas dos blocos ao interagir com eles utilizando um graveto. As informações do bloco são enviadas diretamente ao console do servidor.

## Instalação

1. Compile o projeto via Maven ou utilize o `.jar` gerado.
2. Coloque o arquivo `BlockInspector.jar` na pasta `plugins` do servidor Bukkit.
3. Certifique-se de que o servidor utiliza Bukkit 1.7.3-beta.
4. Inicie ou reinicie o servidor.

## Como funciona

1. Entre no servidor e obtenha um **graveto** (`stick`).
2. Segure o graveto na mão principal.
3. Clique com o **botão direito** do mouse em qualquer bloco.
4. O plugin enviará ao console as informações:
   - Nome do material
   - ID do material
   - Data do bloco (byte)

**Exemplo de saída no console:**

```
[BlockInspector] Bloco inspecionado por <NOME_DO_JOGADOR>:
-> Nome do Material: STONE
-> ID do Material: 1
-> Data do Bloco: 0
```

**No chat do jogador será exibido:**
`[Inspector] Informacao do bloco enviada para o console do servidor.`

## Reportar bugs ou requisitar features

Reporte bugs em [issues](https://github.com/andradecore/BlockInspector/issues).

## Contato:

- Discord: https://discord.gg/tthPMHrP
