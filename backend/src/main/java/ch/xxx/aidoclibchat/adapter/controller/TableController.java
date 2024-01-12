/**
 *    Copyright 2023 Sven Loesekann
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
       http://www.apache.org/licenses/LICENSE-2.0
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package ch.xxx.aidoclibchat.adapter.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.xxx.aidoclibchat.usecase.mapping.TableMapper;
import ch.xxx.aidoclibchat.usecase.service.TableService;

@RestController
@RequestMapping("rest/table")
public class TableController {
	private TableMapper tableMapper;
	private TableService tableService;

	public TableController(TableMapper tableMapper, TableService tableService) {
		this.tableMapper = tableMapper;
		this.tableService = tableService;
	}
	
	@GetMapping("/import")
	public boolean importData() {
		this.tableService.importData();
		return true;
	}
}
