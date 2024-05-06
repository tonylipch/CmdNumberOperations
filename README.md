
<H1>Návod k použití</H1>


<P>Tento program umožňuje zpracování seznamu čísel podle specifikovaných podmínek a ukládání výsledků do souboru. Zde jsou kroky, které je třeba dodržet k úspěšnému spuštění a použití:</P>

<h1><b>Spuštění programu</b></h1>

<h2>Překlad kódu:
  
<ul>
  <ol>Přejděte do adresáře s kódem (cd adresář-s-kódem).
  Udelejte mvn clea pomocí příkazu mvn clean package.</ol>
  <ol>Po generace jar file můžete soustit programu pomocí příkazu <h3><b>"-jar Numbers-jar-with-dependencies.jar"</b></h3></ol>
</ul>
</h2>




<h1>Návod k použití</h1>

<p>Tento program umožňuje zpracování seznamu čísel podle specifikovaných podmínek a ukládání výsledků do souboru. Zde jsou kroky, které je třeba dodržet k úspěšnému spuštění a použití:</p>

<h2>Spuštění programu</h2>

<ul>

  <li><strong>Překlad kódu:</strong>
        <ul>
            <li>Přejděte do adresáře s kódem (<code>cd adresář-s-kódem</code>).</li>
            <li> Udelejte mvn clean pomocí příkazu mvn clean package.</li>
            <li> Po generace jar file můžete soustit programu pomocí příkazu <h3><b>"-jar Numbers-jar-with-dependencies.jar"</li>
        </ul>
    </li>

  <li><strong>Spuštění programu:</strong>
        <ul>
            <li>Spusťte program s příslušnými argumenty:
                <pre><code>-jar Numbers-jar-with-dependencies.jar [Tady můžete zadat počet čisel nebo soubor]</code></pre>
            </li>
        </ul>
    </li>
</ul>

<h2>Argumenty programu</h2>

<p><strong>počet-prvků-či-soubor:</strong></p>
<ul>
    <li>Pokud je specifikováno číslo, bude očekáván počet prvků pro vstup z konzole.</li>
    <li>Pokud je specifikováno jméno souboru, budou čísla načtena ze souboru.</li>
</ul>

<p><strong>výstupní-soubor</strong> (volitelný):</p>
<ul>
    <li>Pokud je specifikován, výsledné čísla budou uloženy do tohoto souboru.</li>
</ul>

<h2>Formát vstupních dat</h2>

<ul>
    <li>Pokud jsou data načítána z konzole, uživatel bude vyzván k zadání požadovaného počtu čísel.</li>
    <li>Pokud jsou data načítána ze souboru, očekává se, že každé číslo bude na samostatném řádku.</li>
</ul>

<h2>Formát výstupních dat</h2>

<ul>
    <li>Výsledná data jsou zapsána do souboru výstupu, každé číslo na samostatném řádku.</li>
</ul>

<h2>Požadavky</h2>

<ul>
    <li>Pro spuštění tohoto programu je nutné mít nainstalované JRE (Java Runtime Environment).</li>
</ul>

<h2>Poznámky</h2>

<ul>
    <li>Program automaticky detekuje, zda jsou vstupní údaje čísla nebo jméno souboru.</li>
    <li>Pokud jsou vstupní údaje neplatná, program vypíše odpovídající chybové zprávy.</li>
</ul>

<h2>Příklady použití</h2>

<h3>-jar Numbers-jar-with-dependencies.jar 3<h3>
<h4>Zdaejte jaky kolív 3 čisla  třeba (2 3 4). Program vypiše [3]

<h2>Podrobny testy programy byli napsany v Junit testů</h2>



