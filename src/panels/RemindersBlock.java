package panels;

/**
 *
 * @author Matheus
 */
public class RemindersBlock extends javax.swing.JPanel {

    /**
     * Creates new form NotesBLoc
     */
    public RemindersBlock() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane = new javax.swing.JScrollPane();
        remindersBlockDescription = new javax.swing.JTextArea();
        remindersBlockTitle = new javax.swing.JTextField();
        remindersBlockDateLabel = new javax.swing.JLabel();
        remindersBlockPriority = new javax.swing.JLabel();

        remindersBlockDescription.setColumns(20);
        remindersBlockDescription.setRows(5);
        jScrollPane.setViewportView(remindersBlockDescription);

        remindersBlockTitle.setEditable(false);
        remindersBlockTitle.setText("Título");
        remindersBlockTitle.setBorder(null);
        remindersBlockTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remindersBlockTitleActionPerformed(evt);
            }
        });

        remindersBlockDateLabel.setText("Data do lembrete");

        remindersBlockPriority.setBackground(new java.awt.Color(255, 255, 255));
        remindersBlockPriority.setText("Prioridade");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(remindersBlockTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(115, 115, 115)
                        .addComponent(remindersBlockPriority))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(remindersBlockDateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(remindersBlockTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remindersBlockPriority))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(remindersBlockDateLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void remindersBlockTitleActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_remindersBlockTitleActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_remindersBlockTitleActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane;
    public javax.swing.JLabel remindersBlockDateLabel;
    public javax.swing.JTextArea remindersBlockDescription;
    public javax.swing.JLabel remindersBlockPriority;
    public javax.swing.JTextField remindersBlockTitle;
    // End of variables declaration//GEN-END:variables
}
