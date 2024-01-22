Commit:
Commit ist ein Git-Befehl, der einen Schnappschuss der aktuellen Änderungen am Repository erstellt. Dieser Schnappschuss kann dann als Version des Repositorys gespeichert werden. 
Der Befehl zeichnet auch eine Nachricht auf, die die in diesem Commit vorgenommenen Änderungen beschreibt.
--> git commit -m "This is a message that describes the changes made in this commit"

Branch: 
Branch in Git ist ein eindeutiger Zeiger auf den Snapshot eines Repositorys. Jedes Mal, wenn Sie eine Übertragung vornehmen, wird der aktuelle Zweig nach vorne verschoben. Sie können Zweige verwenden, um an verschiedenen Funktionen oder Fehlerkorrekturen zu arbeiten 
ohne die Hauptcodebasis zu beeinflussen.
--> git branch new-feature

Checkout:
Checkout ist ein Git-Befehl, mit dem Sie zwischen verschiedenen Zweigen oder Commit-Snapshots navigieren können. Er ändert den HEAD und das Arbeitsverzeichnis in den Snapshot, auf den der angegebene 
Branch oder Commit zeigt.
--> git checkout new-feature

Reset:
Reset ist ein Git-Befehl, der den aktuellen Branch-Head auf den angegebenen Commit zurücksetzt. Er kann verwendet werden, um aktuelle Übertragungen aus dem Zweig zu entfernen.
--> git reset HEAD~2

Rebase:
Rebase ist ein Git-Befehl, der Änderungen von einem Branch in einen anderen integriert. Er verschiebt die Übertragungen von einem Zweig in einen anderen. Dies ist nützlich, um einen linearen 
Verlauf aufrechtzuerhalten und Merge-Konflikte zu reduzieren.
--> git checkout experiment
--> git rebase master

Merge:
Merge ist ein Git-Befehl, der die Änderungen aus einem Zweig in einem anderen zusammenführt. Dazu wird ein neuer Merge Commit erstellt, der sowohl auf den aktuellen Zweig als auch auf den 
zusammenzuführenden Zweig verweist.
--> git checkout master
--> git merge new-feature

Push:
Push ist ein Git-Befehl, der den Inhalt des lokalen Repository in ein entferntes Repository hochlädt. Er aktualisiert den entfernten Zweig, damit er mit dem lokalen Zweig übereinstimmt.
--> git push origin new-feature

Pull:
Pull ist ein Git-Befehl, der Änderungen aus einem entfernten Repository abruft und in den aktuellen Zweig einfügt.
--> git pull origin master

Origin:
Origin ist ein gängiger Name für das Standard-Remote-Repository. Wenn Sie ein Repository klonen, erstellt Git automatisch eine Remote-Verbindung namens Origin, die auf das ursprüngliche Repository verweist. 
Diese Verbindung wird von Git verwendet, um Änderungen zwischen Ihrem lokalen Repository und dem entfernten Repository zu synchronisieren.



