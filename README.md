# Kapitel 6 Übung in der Vorlesung ("Autos, Fahrer und Wettrennen")

## Teil 1

* Implementieren Sie die bisher vorgestellte Klasse ```Auto```.
* Schreiben Sie eine neue Klasse ```AutoTester```, in deren ```main```-Methode Sie zwei neue Autos erzeugen und diese jeweils nacheinander drei unterschiedliche Wegstrecken zurücklegen lassen. Verwenden Sie hierzu ```Zufall.getZufallInt(min, max)``` aus der letzten Vorlesung.
* Geben Sie nach jeder Wegstrecke die gefahrenen Gesamtkilometer und den Tankinhalt aus.


## Teil 2

* Erweitern Sie die Klasse Auto derart, dass der "Benzinverbrauch pro km" und der "maximale Tankinhalt" ebenfalls Eigenschaften eines Autos sind.
* Es soll nur solange gefahren werden, wie der Treibstoff reicht. Implementieren Sie folgende Methode, um den Tank aufzufüllen: ```tanken(int liter)``` 

## Teil 3

* Erstellen Sie eine Klasse ```Person```. Eine Person soll einen Vor- und einen Nachnamen besitzen. Desweiteren interessiert uns noch das Geburtsjahr.
* Legen Sie zwei Personen an und geben Sie jeweils den Namen und das Alter der Person aus.

## Teil 4

* Erweitern Sie die Klasse ```Auto``` um zwei Exemplarvariablen ```profiltiefeReifen``` und ```wagenname```.
* Bei jeder Fahrt wird ab sofort auch das Profil der Reifen abgefahren. Mit unzureichender Profiltiefe (< 3 mm) soll ein Auto nicht mehr fahren.
* Erstellen Sie eine Methode ```wechlseReifen()```, um die Profiltiefe wiederherzustellen.
* Der Wagenname soll nur im Konstruktor übergeben werden und sonst nicht änderbar sein. Er soll jedoch bei Bedarf ausgegeben werden können.

## Teil 5

* Erweitern Sie die Klasse Auto um eine Instanzvariable ```fahrer```. Der Fahrer soll vom Typ ```Person``` aus Teil 3 sein.
* Vor jeder Fahrt muss ein Fahrer in das Auto gesetzt werden. Ohne Fahrer fährt das Auto nicht.
* Ist der Fahrer besonders jung (<= 20), so soll der Verbrauch um 10% und die Reifenabnutzung um 5% steigen. Ist der Fahrer besonders alt (>= 60), sinken die Werte um 10% bzw 5%.

## Teil 6

Simulieren Sie zum Test ein 1000-Minuten-Rennen nach folgenden Regeln:

* Es sollen 5 Autos und 4 Fahrer teilnehmen. Zu Beginn werden die Fahrer den Autos zufällig zugewiesen.
* Jede Minute wird neu entschieden, ob gefahren wird, getankt wird oder die Reifen gewechselt werden (treffen Sie die Entscheidung möglichst optimal).
* Wenn gefahren wird, ist die zurückgelegte Strecke zufällig zwischen 3 und 4 zu ermitteln.
* Alle 10 Minuten wechselt ein zufälliger Fahrer in das leere Auto und lässt das alte leer stehen.
