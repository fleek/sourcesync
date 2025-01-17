package org.wavescale.sourcesync.action;

import org.wavescale.sourcesync.ui.ConnectionConfigurationDialog;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;

/**
 * ****************************************************************************
 * Copyright (c) 2014-2107 Faur Ioan-Aurel.                                     *
 * All rights reserved. This program and the accompanying materials             *
 * are made available under the terms of the MIT License                        *
 * which accompanies this distribution, and is available at                     *
 * http://opensource.org/licenses/MIT                                           *
 * *
 * For any issues or questions send an email at: fioan89@gmail.com              *
 * *****************************************************************************
 */

public class ActionSourceSyncMenu extends AnAction
{
    public void actionPerformed(AnActionEvent e)
    {
        new ConnectionConfigurationDialog(e.getProject()).show();
    }

}
