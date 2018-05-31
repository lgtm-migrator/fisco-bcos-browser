/*
 * This file is part of FISCO BCOS Browser.
 *
 * FISCO BCOS Browser is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FISCO BCOS Browser is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with FISCO BCOS Browser.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * @file: ReqGetTbPendingTransactionByPkHashVO.java
 * @author: v_wbsqwu
 * @date: 2018
 */

package org.bcos.browser.entity.req;

import java.io.Serializable;

public class ReqGetTbPendingTransactionByPkHashVO implements Serializable{
    private static final long serialVersionUID = 5699037013097205111L;
    private String pkHash;

    public String getPkHash() {
        return pkHash;
    }

    public void setPkHash(String pkHash) {
        this.pkHash = pkHash;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"pkHash\":\"")
                .append(pkHash).append('\"');
        sb.append('}');
        return sb.toString();
    }
}
