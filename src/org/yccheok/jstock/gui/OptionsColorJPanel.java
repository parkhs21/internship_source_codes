/*
 * JStock - Free Stock Market Software
 * Copyright (C) 2010 Yan Cheng CHEOK <yccheok@yahoo.com>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package org.yccheok.jstock.gui;

import org.yccheok.jstock.internationalization.GUIBundle;

/**
 *
 * @author  yccheok
 */
public class OptionsColorJPanel extends javax.swing.JPanel implements JStockOptionsObserver {
    
    /** Creates new form OptionsColorJPanel */
    public OptionsColorJPanel() {
        initComponents();

        if (org.yccheok.jstock.engine.Utils.isFallBelowAndRiseAboveColorReverse()) {
            // Reverse the fall below and rise above labelling.
            final String tmp = this.jLabel2.getText();
            this.jLabel2.setText(this.jLabel3.getText());
            this.jLabel3.setText(tmp);
        }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel24 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel22 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jXHeader1 = new org.jdesktop.swingx.JXHeader();

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setLayout(new java.awt.BorderLayout());

        jPanel14.setLayout(new java.awt.BorderLayout());

        jPanel1.setOpaque(false);

        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/yccheok/jstock/data/gui"); // NOI18N
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsColorJPanel_TableForeground"))); // NOI18N
        jPanel2.setLayout(new java.awt.BorderLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel5.setLayout(new java.awt.GridLayout(3, 1, 5, 5));

        jPanel6.setBackground(new java.awt.Color(0, 0, 0));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel6.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 0, 0));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel7.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel8.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8);

        jPanel2.add(jPanel5, java.awt.BorderLayout.EAST);

        jPanel15.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel15.setLayout(new java.awt.GridLayout(3, 1, 5, 5));

        jLabel1.setText(bundle.getString("OptionsColorJPanel_NormalText")); // NOI18N
        jPanel15.add(jLabel1);

        jLabel2.setText(bundle.getString("OptionsColorJPanel_LowerNumericalValue")); // NOI18N
        jPanel15.add(jLabel2);

        jLabel3.setText(bundle.getString("OptionsColorJPanel_HigherNumericalValue")); // NOI18N
        jPanel15.add(jLabel3);

        jPanel2.add(jPanel15, java.awt.BorderLayout.CENTER);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsColorJPanel_TableBackground"))); // NOI18N
        jPanel3.setLayout(new java.awt.BorderLayout(5, 5));

        jPanel18.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel18.setLayout(new java.awt.GridLayout(3, 1, 5, 5));

        jPanel9.setBackground(new java.awt.Color(0, 0, 0));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel9.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel9);

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel10.setForeground(new java.awt.Color(255, 255, 255));
        jPanel10.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel10);

        jPanel3.add(jPanel18, java.awt.BorderLayout.EAST);

        jPanel19.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel19.setLayout(new java.awt.GridLayout(3, 1, 5, 5));

        jLabel4.setText(bundle.getString("OptionsColorJPanel_FirstRow")); // NOI18N
        jPanel19.add(jLabel4);

        jLabel5.setText(bundle.getString("OptionsColorJPanel_SecondRow")); // NOI18N
        jPanel19.add(jLabel5);

        jPanel3.add(jPanel19, java.awt.BorderLayout.CENTER);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsColorJPanel_FallBelowAlert"))); // NOI18N
        jPanel13.setLayout(new java.awt.BorderLayout());

        jPanel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel4.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel8.setText(bundle.getString("OptionsColorJPanel_Foreground")); // NOI18N
        jLabel8.setEnabled(false);
        jPanel4.add(jLabel8);

        jLabel9.setText(bundle.getString("OptionsColorJPanel_Background")); // NOI18N
        jLabel9.setEnabled(false);
        jPanel4.add(jLabel9);

        jPanel13.add(jPanel4, java.awt.BorderLayout.CENTER);

        jPanel23.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel23.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jPanel16.setBackground(new java.awt.Color(0, 0, 0));
        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel16.setEnabled(false);
        jPanel16.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel16MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel16);

        jPanel17.setBackground(new java.awt.Color(0, 0, 0));
        jPanel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel17.setEnabled(false);
        jPanel17.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel23.add(jPanel17);

        jPanel13.add(jPanel23, java.awt.BorderLayout.EAST);

        jCheckBox1.setText(bundle.getString("OptionsColorJPanel_EnableColorChangeUpdate")); // NOI18N
        jCheckBox1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox1.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsColorJPanel_AutoUpdate"))); // NOI18N
        jPanel22.setLayout(new java.awt.BorderLayout());

        jPanel21.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel21.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jPanel11.setBackground(new java.awt.Color(0, 0, 0));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel11.setEnabled(false);
        jPanel11.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel11);

        jPanel12.setBackground(new java.awt.Color(0, 0, 0));
        jPanel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel12.setEnabled(false);
        jPanel12.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel21.add(jPanel12);

        jPanel22.add(jPanel21, java.awt.BorderLayout.EAST);

        jPanel20.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel20.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel6.setText(bundle.getString("OptionsColorJPanel_Foreground")); // NOI18N
        jLabel6.setEnabled(false);
        jPanel20.add(jLabel6);

        jLabel7.setText(bundle.getString("OptionsColorJPanel_Background")); // NOI18N
        jLabel7.setEnabled(false);
        jPanel20.add(jLabel7);

        jPanel22.add(jPanel20, java.awt.BorderLayout.CENTER);

        jButton8.setText(bundle.getString("OptionsColorJPanel_ResetToDefaultColor")); // NOI18N
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jCheckBox2.setText(bundle.getString("OptionsColorJPanel_EnableColorChangeAlert")); // NOI18N
        jCheckBox2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jCheckBox2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jCheckBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox2ItemStateChanged(evt);
            }
        });

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(bundle.getString("OptionsColorJPanel_RiseAboveAlert"))); // NOI18N
        jPanel25.setLayout(new java.awt.BorderLayout());

        jPanel26.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel26.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jLabel10.setText(bundle.getString("OptionsColorJPanel_Foreground")); // NOI18N
        jLabel10.setEnabled(false);
        jPanel26.add(jLabel10);

        jLabel11.setText(bundle.getString("OptionsColorJPanel_Background")); // NOI18N
        jLabel11.setEnabled(false);
        jPanel26.add(jLabel11);

        jPanel25.add(jPanel26, java.awt.BorderLayout.CENTER);

        jPanel27.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel27.setLayout(new java.awt.GridLayout(2, 1, 5, 5));

        jPanel28.setBackground(new java.awt.Color(0, 0, 0));
        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel28.setEnabled(false);
        jPanel28.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel28MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel28);

        jPanel29.setBackground(new java.awt.Color(0, 0, 0));
        jPanel29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel29.setEnabled(false);
        jPanel29.setPreferredSize(new java.awt.Dimension(24, 24));
        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel29MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 22, Short.MAX_VALUE)
        );

        jPanel27.add(jPanel29);

        jPanel25.add(jPanel27, java.awt.BorderLayout.EAST);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jCheckBox2)
                                .addGap(75, 75, 75))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel25, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(132, 132, 132)
                                .addComponent(jButton8))
                            .addComponent(jCheckBox1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(73, Short.MAX_VALUE))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel13, jPanel2, jPanel22, jPanel25, jPanel3});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton8)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel13, jPanel25});

        jPanel14.add(jPanel1, java.awt.BorderLayout.CENTER);

        add(jPanel14, java.awt.BorderLayout.CENTER);

        jXHeader1.setDescription(bundle.getString("OptionsColorJPanel_Description")); // NOI18N
        jXHeader1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/32x32/colors.png"))); // NOI18N
        jXHeader1.setTitle(bundle.getString("OptionsColorJPanel_Color")); // NOI18N
        add(jXHeader1, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        jPanel6.setBackground(JStockOptions.DEFAULT_NORMAL_TEXT_FOREGROUND_COLOR);
        jPanel7.setBackground(JStockOptions.DEFAULT_LOWER_NUMERICAL_VALUE_FOREGROUND_COLOR);
        jPanel8.setBackground(JStockOptions.DEFAULT_HIGHER_NUMERICAL_VALUE_FOREGROUND_COLOR);

        jPanel9.setBackground(JStockOptions.DEFAULT_FIRST_ROW_BACKGROUND_COLOR);
        jPanel10.setBackground(JStockOptions.DEFAULT_SECOND_ROW_BACKGROUND_COLOR);

        jPanel11.setBackground(JStockOptions.DEFAULT_AUTO_UPDATE_FOREGROUND_COLOR);
        jPanel12.setBackground(JStockOptions.DEFAULT_AUTO_UPDATE_BACKGROUND_COLOR);

        jPanel16.setBackground(JStockOptions.DEFAULT_FALL_BELOW_ALERT_FOREGROUND_COLOR);
        jPanel17.setBackground(JStockOptions.DEFAULT_FALL_BELOW_ALERT_BACKGROUND_COLOR);

        jPanel28.setBackground(JStockOptions.DEFAULT_RISE_ABOVE_ALERT_FOREGROUND_COLOR);
        jPanel29.setBackground(JStockOptions.DEFAULT_RISE_ABOVE_ALERT_BACKGROUND_COLOR);

        this.jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jPanel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseClicked
        if (jPanel17.isEnabled() == false) return;

        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel17.getBackground());

        if (null == color) return;

        jPanel17.setBackground(color);
    }//GEN-LAST:event_jPanel17MouseClicked

    private void jPanel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseClicked
        if (jPanel16.isEnabled() == false) {
            return;
        }
        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel16.getBackground());
        if (null == color) {
            return;
        }
        jPanel16.setBackground(color);
    }//GEN-LAST:event_jPanel16MouseClicked

    private void jCheckBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox2ItemStateChanged
        // TODO add your handling code here:
        final boolean status = jCheckBox2.isSelected();

        jLabel8.setEnabled(status);
        jLabel9.setEnabled(status);
        jLabel10.setEnabled(status);
        jLabel11.setEnabled(status);
        jPanel16.setEnabled(status);
        jPanel17.setEnabled(status);
        jPanel13.setEnabled(status);
        jPanel25.setEnabled(status);
        jPanel28.setEnabled(status);
        jPanel29.setEnabled(status);
    }//GEN-LAST:event_jCheckBox2ItemStateChanged

    private void jPanel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseClicked
        if(jPanel12.isEnabled() == false) return;

        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel12.getBackground());

        if (null == color) return;

        jPanel12.setBackground(color);
    }//GEN-LAST:event_jPanel12MouseClicked

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        if (jPanel11.isEnabled() == false) return;

        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel11.getBackground());

        if(null == color) return;

        jPanel11.setBackground(color);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        final boolean status = jCheckBox1.isSelected();

        jLabel6.setEnabled(status);
        jLabel7.setEnabled(status);
        jPanel11.setEnabled(status);
        jPanel12.setEnabled(status);
        jPanel22.setEnabled(status);
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked

        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel10.getBackground());

        if (null == color) return;

        jPanel10.setBackground(color);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel9.getBackground());

        if (null == color) return;

        jPanel9.setBackground(color);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel8.getBackground());

        if (null == color) return;

        jPanel8.setBackground(color);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel7.getBackground());

        if(null == color) return;

        jPanel7.setBackground(color);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel6.getBackground());

        if(null == color) return;

        jPanel6.setBackground(color);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseClicked
        if (jPanel28.isEnabled() == false) {
            return;
        }
        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel28.getBackground());
        if (null == color) {
            return;
        }
        jPanel28.setBackground(color);
    }//GEN-LAST:event_jPanel28MouseClicked

    private void jPanel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseClicked
        if (jPanel29.isEnabled() == false) {
            return;
        }
        final java.awt.Color color = javax.swing.JColorChooser.showDialog(this, GUIBundle.getString("OptionsColorJPanel_ChooseAColor"), this.jPanel29.getBackground());
        if (null == color) {
            return;
        }
        jPanel29.setBackground(color);
    }//GEN-LAST:event_jPanel29MouseClicked

    @Override
    public void set(JStockOptions jStockOptions) {        
        jPanel6.setBackground(jStockOptions.getNormalTextForegroundColor());
        jPanel7.setBackground(jStockOptions.getLowerNumericalValueForegroundColor());
        jPanel8.setBackground(jStockOptions.getHigherNumericalValueForegroundColor());

        jPanel9.setBackground(jStockOptions.getFirstRowBackgroundColor());
        jPanel10.setBackground(jStockOptions.getSecondRowBackgroundColor());

        jPanel11.setBackground(jStockOptions.getAutoUpdateForegroundColor());
        jPanel12.setBackground(jStockOptions.getAutoUpdateBackgroundColor());

        jPanel16.setBackground(jStockOptions.getFallBelowAlertForegroundColor());
        jPanel17.setBackground(jStockOptions.getFallBelowAlertBackgroundColor());

        jPanel28.setBackground(jStockOptions.getRiseAboveAlertForegroundColor());
        jPanel29.setBackground(jStockOptions.getRiseAboveAlertBackgroundColor());
        
        this.jCheckBox1.setSelected(jStockOptions.isEnableColorChange());
        this.jCheckBox2.setSelected(jStockOptions.isEnableColorAlert());
    }

    @Override
    public boolean apply(JStockOptions jStockOptions) {
        jStockOptions.setNormalTextForegroundColor(jPanel6.getBackground());
        jStockOptions.setLowerNumericalValueForegroundColor(jPanel7.getBackground());
        jStockOptions.setHigherNumericalValueForegroundColor(jPanel8.getBackground());

        jStockOptions.setFirstRowBackgroundColor(jPanel9.getBackground());
        jStockOptions.setSecondRowBackgroundColor(jPanel10.getBackground());

        jStockOptions.setAutoUpdateForegroundColor(jPanel11.getBackground());        
        jStockOptions.setAutoUpdateBackgroundColor(jPanel12.getBackground());

        jStockOptions.setFallBelowAlertForegroundColor(jPanel16.getBackground());
        jStockOptions.setFallBelowAlertBackgroundColor(jPanel17.getBackground());

        jStockOptions.setRiseAboveAlertForegroundColor(jPanel28.getBackground());
        jStockOptions.setRiseAboveAlertBackgroundColor(jPanel29.getBackground());
        
        jStockOptions.setEnableColorChange(jCheckBox1.isSelected());
        jStockOptions.setEnableColorAlert(jCheckBox2.isSelected());
        
        JStock m = JStock.instance();
        if (m != null) {
            m.repaintTable();
        }        
        return true;
    }
            
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private org.jdesktop.swingx.JXHeader jXHeader1;
    // End of variables declaration//GEN-END:variables
    
}